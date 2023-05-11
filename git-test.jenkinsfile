pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }
                print('hello')
            }
        }
    }
}
void print(message) {
    echo "${message}"
}
