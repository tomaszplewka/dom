---
name: next-feature
description: Start or continue the next roadmap feature in teaching mode. Explain the concepts, plan with the user, then build in small steps with TODO(human) parts for the user.
disable-model-invocation: true
argument-hint: "[roadmap item number, optional]"
---

# Next feature

## 1. Pick the item
- Read `ROADMAP.md`. Take item `$ARGUMENTS` if given. Otherwise take the item that's `in progress`, or else the first `todo`.
- Skim the latest 1–2 notes in `learning/` to see what I already know. Don't re-explain those concepts.
- If an item is `in progress`, check `git status` and `git diff` to see where we stopped, and continue from there.

## 2. Concepts first (no code yet)
- In a few short paragraphs, explain the backend concepts this feature introduces (from the roadmap's "Backend concepts" column). Use a frontend/TypeScript analogy where one fits.
- Ask if I want to go deeper on any of them before we plan.

## 3. Plan together
- Propose a design: endpoints, data model, the files to add or change, and the tests.
- For each important decision, name one alternative and why you'd skip it for now.
- Split the work into **3–6 small steps**. Each step must be reviewable in a few minutes.
- Wait for my approval. Change the plan if I push back.
- Set the item's status to `in progress` in `ROADMAP.md`.

## 4. Build step by step
For each step:
1. Make only that step's change.
2. Leave 1–2 small, meaningful `TODO(human)` pieces with a hint (e.g. a validation rule, a query, an assertion).
3. Run the tests and report the result in one line. Failing tests caused by the `TODO(human)` parts are expected: say so.
4. Summarise: what changed, which new concept appeared, and where to look in the diff.
5. **Stop and wait.** I'll write my parts and ask questions. Then review my code: kindly, like a senior dev, with explanations.

## 5. Finish the feature
- When all steps are done and the tests pass, set the item to `done` in `ROADMAP.md`.
- Suggest next: `/quiz` to check understanding and `/recap` to write the notes.
- Ask me whether to commit and push. Only after I approve: use a Conventional Commit message (see `CLAUDE.md`), with no Claude attribution.
