def folder = Jenkins.instance.getItem("folder_name")
def job = folder.getItem("job_name")
job.getBuilds().each { it.delete() }
job.nextBuildNumber = 1
job.save()
