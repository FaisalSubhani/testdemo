pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                // Here you can define commands for your build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // Here you can define commands for your tests
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Here you can define commands for your deployment
            }
        }
    }

    post {
        always {
            // This action will happen always regardless of the result of build
            echo 'Post build condition running'
        }
        failure {
            // This action will happen only if the build has failed
            echo 'Post Action if Build Failed'
        }
    }
}
