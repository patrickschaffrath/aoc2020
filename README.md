# aoc2020

## Parsing of inputs

Use

```bash
curl -sb session=<token> https://adventofcode.com/2020/day/<day>/input
```

with valid \<token> and \<day>, then pipe with `sed` command of the day.

### Day2

```bash
sed -r 's/\x2D/\x20/;s/([a-z])\x3A/\\\1/;s/([a-z]{2,})/\x22\1\x22/g;s/^/\[/;s/$/\]/'
```

## License

Copyright © 2020 Patrick Schaffrath

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
