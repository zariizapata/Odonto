pipeline{
	
		agent {
		label 'Slave_Induccion'
		}
	
    
	
		tools {
		jdk 'JDK8_Centos' 
		gradle 'Gradle5.6_Centos' 
		}
	
		stages{
		
			stage('Checkout') {
				steps {
                echo '------------>Checkout desde Git Microservicio<------------'
                checkout([
                	$class: 'GitSCM', 
                	branches: [[name: '*/master']], 
                	doGenerateSubmoduleConfigurations: false, 
                	extensions: [], 
                	gitTool: 'Git_Centos', 
                	submoduleCfg: [], 
                	userRemoteConfigs: [[
                		credentialsId: 'GitHub_zariizapata', 
                		url: 'https://github.com/zariizapata/Odonto.git'
                		]]
                	])
				}
			}
		
					stage('Build project') {
					    steps {
					        echo "------------>Building project<------------"
					           sh 'gradle --b ./build.gradle clean'
					           sh 'gradle --b ./build.gradle build'
					       }
					   }
	                  stage('Compile & Unit Tests') {
                          steps {
                             echo "--------------->Unit Tests<--------"
                             sh 'gradle --b ./build.gradle test'
                             sh 'gradle --b ./build.gradle jacocoTestReport'
                          }
                       }
                       stage('Static Code Analysys'){
                          steps {
                             echo '----------------->Analisis de Código estático<-----------------'
                             withSonarQubeEnv('Sonar'){
                                sh "${tool name: 'SonarScanner', type:'hudson.plugins.sonar.SonarRunnerInstallation'}/bin/sonar-scanner -Dproject.settings=sonar-project.properties -Dsonar.java.libraries=/home/ic/.gradle/caches/modules-2/files-2.1/**/*.jar"
                             }
                          }
                       }

		}
		post {
		success {
				echo '--------success------------------'
				junit 'build/test-results/test/*.xml'
				}
			failure {
				mail(to: 'sara.zapata@ceiba.com.co',
				body:"Build failed in Jenkins: Project: ${env.JOB_NAME} Build /n Number: ${env.BUILD_NUMBER} URL de build: ${env.BUILD_NUMBER}/n/nPlease go to ${env.BUILD_URL} and verify the build",
				subject: "ERROR CI: ${env.JOB_NAME}")
			}
		}	
			
}