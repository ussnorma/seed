job('Hello World') {
  steps {
    shell('bash /var/lib/jenkins/script.sh')
  }
}