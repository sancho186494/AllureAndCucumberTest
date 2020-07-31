pipeline {

    agent any

    stages {
        stage('Передаваемый параметр') {
            steps {
                echo "${PARAM}"
            }
        }
        stage('Build process') {
            steps {
                withMaven(jdk: 'jdk8', maven: 'mavenn') {
                    bat "mvn clean test ${PARAM}"
                }
            }
        }
        stage('Allure report generation') {
            steps {
                allure includeProperties: false,
                        jdk: 'jdk8',
                        report: 'target/allure-report',
                        results: [[path: 'targer/allure-results']]
                }
            }
        }
    }