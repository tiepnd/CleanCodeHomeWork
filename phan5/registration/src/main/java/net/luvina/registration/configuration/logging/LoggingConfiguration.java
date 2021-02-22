package net.luvina.registration.configuration.logging;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoggingConfiguration extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    // We CANNOT simply read the request body here
    // Because the InputStream would be consumed and cannot be read again by the
    // actual processing/server
    ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
    ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);

    filterChain.doFilter(requestWrapper, responseWrapper);

    // We can only log the request body AFTER the request has been made and
    // ContentCachingRequestWrapper did its work
    String requestBody = this.getContentAsString(requestWrapper.getContentAsByteArray());

    // Full request URL
    StringBuffer requestURL = request.getRequestURL();
    String queryString = request.getQueryString();
    if (queryString != null) {
      requestURL.append("?").append(queryString);
    }

    log.debug("{} {} {}", request.getMethod(), requestURL, requestBody);

    // Client would not receive response unless call this method
    responseWrapper.copyBodyToResponse();
  }

  private String getContentAsString(byte[] buffer) {
    if (buffer == null || buffer.length == 0) {
      return "";
    }
    return new String(buffer, 0, Math.min(buffer.length, 10000));
  }
}
