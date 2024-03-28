job('HW-20-1') {
  steps {
      folder('dir1') {
        sh """
          git clone --single-branch --branch main https://github.com/ussnorma/seed.git && 
          ls -la 
        """
        deleteFolder()
    }
  }
}