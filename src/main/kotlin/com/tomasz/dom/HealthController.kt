package com.tomasz.dom

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

// The shape of the JSON we send back: {"status":"UP"}.
// Like `type HealthResponse = { status: string }` in TypeScript.
data class HealthResponse(val status: String)

// @RestController = "this class handles HTTP requests, and return values become the JSON body".
// Alternative: @Controller, which returns HTML view names instead (used for server-rendered pages).
@RestController
class HealthController {
  @GetMapping("/health")
  fun health(): HealthResponse = HealthResponse("UP")
}
