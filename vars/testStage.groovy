def call() {
    echo "Executing Shared Library Stage"

    sh '''
        echo "Updating package list..."
        sudo apt-get update -y

        echo "Installing vim..."
        apt-get install -y vim

        echo "Vim installation completed"
    '''

    sh "date"
    sh "hostname"
}
