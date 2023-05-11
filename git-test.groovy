pipeline {
    agent any

    def rootDir = pwd()
    print(rootDir)

    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }

            }
        }
    }
}

void print(message) {
    echo "${message}"
}
