---
name: explain
description: Explain a backend concept, a piece of code (file or file:line), or an error in plain language for a frontend developer learning backend. Use when the user asks what something is, why it's done that way, or how it works.
argument-hint: "<concept | file[:line] | error message>"
---

# Explain

Explain `$ARGUMENTS`. If it's empty, explain the most recent new concept or the latest change in the diff.

## How
- **Find it first.** For code, read only the relevant snippet (plus what it directly calls). For an error, find where it comes from.
- **Structure** (keep it short):
  1. **In one sentence:** what it is.
  2. **Why it's here:** the problem it solves in *this* project.
  3. **How it works:** step by step, with a tiny example from our code (a few lines, not whole files).
  4. **Frontend analogy:** if there's a good one (e.g. middleware is like an interceptor in fetch/axios; a transaction is like an all-or-nothing state update). Skip it if it would mislead.
  5. **Common mistakes:** 1–2 traps beginners fall into.
  6. **Alternatives:** one or two other ways to do it, and when you'd choose them.
  7. **Read more:** one link to the official docs.
- Match the depth to my question. If I ask "why", focus on the reasoning, not the syntax.
- Don't change any code. Offer a small experiment I can try myself (e.g. "remove this annotation and run the test: watch what breaks").
