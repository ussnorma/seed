job('Test') {
  steps {
    shell('bash /var/lib/jenkins/script.sh')
  }
}