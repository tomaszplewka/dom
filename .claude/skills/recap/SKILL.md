---
name: recap
description: Write a short learning note for the finished feature into learning/NN-feature.md - what was built, the backend concepts, key files, gotchas and weak spots - for the user to edit.
disable-model-invocation: true
argument-hint: "[roadmap item number, optional]"
---

# Recap

Write a learning note for roadmap item `$ARGUMENTS`, or, if it's empty, the last one marked `done` in `ROADMAP.md`.

## Steps
1. Gather what's needed, cheaply: the roadmap row, `git diff`/`git log` for the feature, and this session's conversation (questions I asked, quiz weak spots).
2. Write `learning/<NN>-<feature-slug>.md` (`NN` = the roadmap number, two digits). If it already exists, update it instead of creating a new one.
3. Keep it **short** (about one screen), in my words where possible. It's my handbook, not documentation.

## Template

```markdown
# <NN>. <Feature>

**Date:** <YYYY-MM-DD>

## What I built
2-3 sentences.

## Backend concepts
- **<Concept>:** one or two sentences in plain language. Analogy: … (if useful)

## Where to find it in the code
- `path/to/File.kt`: what's important here

## Gotchas
- Things that surprised me or that I got wrong.

## Weak spots to revisit
- From /quiz and my questions. Then: `/explain <topic>`.

## Open questions
- Things I want to understand better later.
```

4. Tell me the file path and ask me to read it and correct it in my own words: rewriting it is part of learning.
