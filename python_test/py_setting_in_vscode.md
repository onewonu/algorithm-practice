# Plugins
- Python Extension
- Code Runner

## Choice interpreter
- open palette (Cmd + Sh + P)
- Python: Select Interpreter

## Code Runner Shortcut
- open palette (Cmd + Sh + P)
- Preferences: Open Keyboard Shortcuts
- Run code

### ❗️command not found: python
- Ctrl + ,
- code-runner.executorMap
- Edit in settings.json
```json
    "code-runner.executorMap": {
        "python": "python3 -u"
    }
```