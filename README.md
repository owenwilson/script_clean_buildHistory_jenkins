# This is a script for clean build history on jenkins

## Note:

change **folder_name** and **job_name**

```
def folder = Jenkins.instance.getItem("folder_name")
```

```
def job = folder.getItem("job_name")
```
