pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Pull the latest code from your repository
                git 'https://github.com/prajwalmaka/Project.git'

                // Ensure the correct directory
                dir('Project') {
                    // Build the project
                    sh 'mvn clean package'
                }
            }
        }
    }
}
