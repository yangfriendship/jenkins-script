pipeline {
    agent any

    stages('Test Hello') {
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
