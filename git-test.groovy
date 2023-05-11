pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }
                def hello = load 'steps/hello.groovy'
                hello.hello()
            }
        }
    }
}

void print(message) {
    echo "${message}"
}
