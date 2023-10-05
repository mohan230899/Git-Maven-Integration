def call() {
    def nexusUrl = 'http://15.207.114.193:8081/'  // Replace with your Nexus URL
    def nexusRepoId = 'pipeline_release_repo'     // Replace with your Nexus release repository ID
    def nexusSnapshotRepoId = 'pipeline-snapshot-repo' // Replace with your Nexus snapshot repository ID

    def nexusCredentials = Jenkins.instance.getDescriptor("hudson.plugins.nexus.NexusPublisher").getCredentials()

    // Deploy your artifacts to Nexus release repository
    sh "mvn deploy -DaltDeploymentRepository=${nexusRepoId}::default::${nexusUrl} -s C:/Users/malak/.m2/settings.xml"

    // Deploy your snapshot artifacts to Nexus snapshot repository
    sh "mvn deploy -DaltDeploymentRepository=${nexusSnapshotRepoId}::default::${nexusUrl} -s C:/Users/malak/.m2/settings.xml"
}
