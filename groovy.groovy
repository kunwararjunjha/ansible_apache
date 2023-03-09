pipeline {
    agent any
    stages {
        stage('Run Ansible playbook') {
            steps {
                sh 'ansible-playbook -i /var/jenkins_home/workspace/Ansible_httpd/inventory /var/jenkins_home/workspace/Ansible_httpd/apache.yml --extra-vars "ansible_ssh_user=krarjunjha ansible_ssh_pass=a"'
            }
        }
    }
}
