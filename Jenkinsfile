pipeline {
    agent any

    triggers {
        // Trigger the pipeline on every push to the repository
        pollSCM('* * * * *')
    }

    stages {
        stage('Récupération du code source') {
            steps {
                // Cette étape clone le référentiel Git
                git 'https://github.com/Fachou01/Git_Project.git'
            }
        }
        stage('Affichage de la date système') {
            steps {
                // Print the current system date
                script {
                    def currentDate = new Date()
                    echo "Current system date is: ${currentDate}"
                }
            }
        }
    }
}
