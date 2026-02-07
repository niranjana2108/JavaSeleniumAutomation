pipeline {
    agent any

    tools {
        jdk 'Java17'
        maven 'Maven3'
    }

    stages {

        stage('Clone') {
            steps {
             git branch: 'main',
                url: 'https://github.com/niranjana2108/JavaSeleniumAutomation.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Report') {
            steps {
                archiveArtifacts artifacts: 'reports/extentReport.html', fingerprint: true
            }
        }
    }
}
