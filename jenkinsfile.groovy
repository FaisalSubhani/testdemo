pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                // Add your build commands here
                sh 'mvn clean install' // Example Maven build command
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // Add your test commands here
                sh 'mvn test' // Example Maven test command
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Add your deployment commands here
                sh 'kubectl apply -f deployment.yaml' // Example Kubernetes deployment command
            }
        }
    }
}
