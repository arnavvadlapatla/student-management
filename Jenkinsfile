pipeline{
    agent any

    stages{
        stage('Checkout'){
            steps{
                git branch: 'main', url: https://github.com/arnavvadlapatla/student-management.git
            }

        }
        stage('Maven Build & Test'){
            steps{
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image'){
            steps{
                sh'docker rm -f student-app || true'
                sh'docker build -t student-app:latest .'
            }
        }

        stage('Run Docker Container'){
            steps{
                sh'docker run -d --name student-app -p 8081:8080 student-app:latest'            }
        }
    }

    post{
        success{echo 'Pipeline completed successfully!'}
        failure{echo 'Pipeline failed!'}
    }
}