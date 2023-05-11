def rootDir = pwd()
print(rootDir)

pipeline {
    agent any

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
