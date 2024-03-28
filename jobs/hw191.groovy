job("hw-19-1") {
	description()
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""#!/bin/bash
curl -G -d country="BY" -d year="2024" -d pretty -d key="6867f807-89d1-426a-91a6-36783f177f25" "https://holidayapi.com/v1/holidays"""")
	}
}