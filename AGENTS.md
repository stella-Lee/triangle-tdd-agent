# AGENTS.md

## Purpose
This repository is for a **Java triangle classification assignment** completed with **strict Test-Driven Development (TDD)** using:
- Eclipse
- JUnit
- Git
- GitHub
- Codex Web

This document defines the required agent and user workflow for all work in this repo.

## Scope
These instructions apply to the entire repository.

## Required Workflow (TDD First)
Follow this loop for every change, feature, and bug fix:

1. **Decompose into the smallest possible task**
   - Break work into tiny, verifiable increments.
   - Each increment should target one behavior at a time.

2. **Write a failing JUnit test first (Red)**
   - Add or update a JUnit test before writing production code.
   - The test should clearly express one expected behavior.
   - Do not implement the feature yet.

3. **Stop and wait for user confirmation from Eclipse**
   - After writing tests, pause.
   - The user runs tests in Eclipse.
   - Continue only after the user confirms the new test fails for the expected reason.

4. **Implement the minimum code to pass (Green)**
   - Write only enough production code to satisfy the failing test.
   - Avoid extra features, speculative abstractions, or premature optimization.

5. **Refactor safely (Refactor)**
   - Improve names, structure, and duplication while keeping behavior unchanged.
   - Keep tests green throughout refactoring.

6. **Track each increment with version control**
   - Use small, frequent Git commits, or
   - Open small, focused PRs on GitHub.
   - Commit/PR messages should map to the specific Red-Green-Refactor step completed.

7. **Repeat the loop**
   - Continue Red → Green → Refactor for the next smallest behavior.

## Collaboration Rules for Codex Web
- Codex must propose and execute one small TDD step at a time.
- Codex must not skip directly to full implementation.
- Codex must not proceed from “test written” to “implementation” until user confirms test failure in Eclipse.
- Codex should explicitly state whether the current step is **Red**, **Green**, or **Refactor**.

## Tooling Expectations
- **Eclipse** is the source of truth for running JUnit tests during the workflow.
- **JUnit** tests define expected behavior.
- **Git/GitHub** preserve granular history of TDD progression.
- **Codex Web** assists with planning, test writing, minimal implementation, and refactoring guidance under this policy.

## Non-Goals
- Do not implement the full triangle classifier in one step.
- Do not add production code before a failing test exists and is confirmed by the user.
