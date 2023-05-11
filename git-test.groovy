#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                    print('${woojung}')
                }
            }
        }
    }
}

void print(message) {
    echo "${message}"
}
