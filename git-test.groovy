pipeline {
    agent any

    stages('Test Hello') {
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
