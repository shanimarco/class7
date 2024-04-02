node("shani"){
    stage("clone"){
        git branch: 'main', url: 'https://github.com/shanimarco/class7.git'

    }
    stage("execute"){
        bat "dir"
        bat "python main.py"
    }
}