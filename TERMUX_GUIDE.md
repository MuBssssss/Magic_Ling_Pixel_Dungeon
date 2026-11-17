# Termux + GitHub Tutorial (for a new chat)

Paste this file at the start of a new chat so the agent works the way you like.

## 1. Setup you already use

- Phone: Android, Termux. Keep every command short.
- `gh` is logged in as `MuBssssss`. Never ask for or paste tokens.
- Commit identity: `Muß <72338839+MuBssssss@users.noreply.github.com>`
- Commit messages: short and clean. No `Co-authored-by`, no footers, no AI/vibecoding tags.

## 2. Can(s)

- Use `*.bash` filenames for scripts (e.g. `fix_pr.bash`). Termux runs them with `bash file.bash`.
- Use `export GODEBUG=http2client=0` before `gh api` calls.
- Give `gh api` large bodies with a seekable `--input file` (not a pipe).
- Retry network calls a few times (flaky mobile/GitHub connections).
- Ship big payloads as gzip + base64 inside the script, so the script stays copyable.
- Keep anything you must copy under about 32 KB. (32 KB worked; 141 KB failed to paste.)
- Use one branch per PR. Use the branch the session names; do not create extra `arena/` branches on GitHub.
- Edit one file at a time. Parallel edits to the same file overwrite each other.
- Give binaries (e.g. `.jar`) as a Termux download command or script, plus an HTTP preview. The chat viewer does not let you download binaries.
- Before opening or updating a PR, read the target repo's `CONTRIBUTING.md`, `docs/PULL_REQUESTS.md`, and CI workflow.
- Check the PR state (open, closed, merged) and the CI result before you report success.
- Say what you verified and what you did not verify.

## 3. Can't(s)

- No `.sh` or `.txt` filenames in the repo folder. The `.gitignore` hides them, so they never get committed.
- No `Co-authored-by` trailers or AI-generated footers in commits or PR text.
- No pushes or branch creation outside the session's assigned branch.
- No dumping very long scripts or files in one chat message.
- No `--auto` on `gh pr merge`. No piping or redirecting merge/close output.
- No asking you for passwords, tokens, or 2FA codes.
- No assuming a PR was rejected for code quality. Check the timeline first. Maintainers can close PRs silently.
- No tests under `src/test/` in a parser PR if the repo's rules forbid it (check `docs/PULL_REQUESTS.md`).
- No binaries pulled from `raw.githubusercontent.com` or release assets in the sandbox (they fail with SSL errors there).

## 4. Lessons learned from your feedback

1. Short copy-paste beats big files. Split big deliverables into small scripts.
2. Filenames matter. Use `*.bash` so Git does not ignore them.
3. Always tell me which branch, PR, and commit you are working on.
4. Check the real API and CI results. Do not claim a fix works from memory.
5. Keep the workspace clean when done. Delete scratch files and temporary scripts.
6. Make the commit author match yours and keep messages plain.
7. Read the project's contribution rules before writing code. They change over time.
8. A green CI does not guarantee a merge. Maintainers can close PRs for their own reasons.
9. When something is blocked, say so plainly and offer the options.

## 5. Starter prompt for a new chat

> Read TERMUX_GUIDE.md first and follow it. I use Termux on Android. Work on branch `<branch>`. Give me copy-paste scripts under 32 KB as `*.bash` files. Check CI and PR state before reporting success.
