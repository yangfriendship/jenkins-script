pipeline {
    agent any
    def hello = load 'steps/hello.groovy'
    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                }
                hello.hello()
            }
        }
    }
}
void print(message) {
    echo "${message}"
}
