pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }
                def rootDir = pwd()
//                def exampleModule = load "${rootDir}@script/Example.Groovy "
                print(rootDir)
            }
        }
    }
}

void print(message) {
    echo "${message}"
}
