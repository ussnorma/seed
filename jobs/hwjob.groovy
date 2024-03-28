job('HW-20-1') {
  steps {
      dir("dir1") {
      //git url: 'https://github.com/ussnorma/seed', branch: 'main'
        sh """
          ls -la 
        """
        deleteDir()
    }
  }
}