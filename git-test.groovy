#!/usr/bin/env groovy

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                retry(2) {
                    sh 'pwd'
                    sh 'ls -al'
                    print("$name")
                    sh 'printenv'
                }
            }
        }
    }
}

void print(message) {
    echo "${message}"
}
