job("hw-19-2") {
	description()
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""#!/bin/python3
            import requests

            url = "https://api.nbrb.by/exrates/rates?periodicity=0"
            response = requests.get(url)
            data = response.json()

            for currency in data:
                abbreviation = currency["Cur_Abbreviation"]
                official_rate = currency["Cur_OfficialRate"]
                print(f"{abbreviation}: {official_rate}")""")
	}
}