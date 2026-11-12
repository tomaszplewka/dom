---
name: quiz
description: Quiz the user with 3-5 questions about the feature just built (or a given topic) to check understanding, one question at a time, with feedback.
disable-model-invocation: true
argument-hint: "[topic or roadmap item, optional]"
---

# Quiz

Topic: `$ARGUMENTS`. If it's empty, use the feature currently `in progress` or the last one marked `done` in `ROADMAP.md`, plus its diff.

## Rules
- **3–5 questions**, from easy to harder. Mix the types:
  - **Concept:** "What's the difference between authentication and authorization?"
  - **Our code:** "What happens in `ListService.addItem` if two requests arrive at the same time?"
  - **Scenario / debugging:** "A user sees someone else's list. Where would you look first?"
  - **Prediction:** "If we remove `@Transactional` here, what will the test show?"
- Ask **one question at a time** and wait for my answer. Don't show the next question or the answer early.
- After each answer, give short feedback: what's right, what's missing, and the correct answer with a one-line "why". Be encouraging but honest.
- If I answer "I don't know", explain it briefly and move on.
- At the end: a score (e.g. 3/4), my **weak spots** (1–3 bullets) and one suggestion for what to revisit (`/explain <topic>`).
- Remember the weak spots for `/recap`.
