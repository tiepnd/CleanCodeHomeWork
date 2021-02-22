package net.luvina.registration.controllers;

import java.util.concurrent.ConcurrentMap;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CachingController {

  private final CacheManager cacheManager;

  @GetMapping("/api/v1/cache/entries")
  public ResponseEntity<ConcurrentMap<Object, Object>> dumEntries(@RequestParam("cacheName") String cacheName) {
    Cache cache = cacheManager.getCache(cacheName);
    ConcurrentMap<Object, Object> entries = ((ConcurrentMapCache) cache).getNativeCache();
    return new ResponseEntity<>(entries, HttpStatus.OK);
  }
  
}
