import urllib.request
import json
try:
    url = 'https://api.github.com/repos/lingamallusaikumar/api-nexus-platform/pulls?state=all'
    req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
    with urllib.request.urlopen(req) as response:
        data = json.loads(response.read().decode())
        print(f"Total PRs found: {len(data)}")
        for pr in data:
            print(f"- {pr['title']} (State: {pr['state']})")
except Exception as e:
    print(e)
