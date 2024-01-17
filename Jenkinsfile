pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                
                bat 'ant clean'
            }
        }
        stage('build') {
            steps {
                
                bat 'ant build'
            }
        }
        stage('test') {
            steps {
                
                bat 'ant Loan_Test'
            }
        }
        stage('mutation') {
            steps {
                
                bat 'ant pit'
            }
        }
        stage('bugs') {
            steps {
                
                bat 'ant spotbugs'
            }
        }
    }
    
}
