# Copyright (C) 2021 Philippe Coval <https://purl.org/rzr/>
SUMMARY = "Games collection"
DESCRIPTION = "Package group bringing games together"

inherit packagegroup

PACKAGES = "packagegroup-games"

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} += "\
astromenace \
atanks \
chromium-bsu \
etr \
freeciv \
gnome-games \
maelstrom \
packagegroup-games-pinball \
pingus \
scummvm \
supertux \
supertuxkart \
wesnoth \
"

