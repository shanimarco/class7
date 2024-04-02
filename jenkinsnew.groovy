properties([pipelineTriggers([pollSCM('* * * * *')])])
node("shani"){
    stage("clone"){
        git branch: 'develop', url: 'https://github.com/shanimarco/class7.git'

    }
    stage("execute"){
        bat "dir"
        bat "python disk_resizer.py"
    }
}