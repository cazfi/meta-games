# Copyright (C) 2020 Philippe Coval <https://purl.org/rzr/pinball>
SUMMARY = "Pinball simulator and extra tables"
DESCRIPTION = "Package group bringing Emilia libre pinball simulator game and tables"

inherit packagegroup

PACKAGES = "packagegroup-games-pinball"

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += " pinball"
RDEPENDS_${PN} += " pinball-table-gnu"
RDEPENDS_${PN} += " pinball-table-hurd"

