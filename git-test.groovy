pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }
                step {
                    print('????')
                }
            }
        }
    }
}

void print(message) {
    echo "${message}"
}
