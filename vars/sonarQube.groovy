def call() {
  withSonarQubeEnv('Sonar-server') {
    sh "mvn sonar:sonar"
  }
}