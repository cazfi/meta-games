DESCRIPTION = "Annihilate the other tanks to earn money, then spend it on bigger and better shields and weapons to wipe out the opposition."
HOMEPAGE = "http://atanks.sourceforge.net/"
SECTION = "games"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=5be586675e7c7aa09afa2c14cb1170a2"

DEPENDS = "allegro4"
PR = "r0"

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${PN}/${PN}-${PV}/${PN}-${PV}.tar.gz \
"

inherit autotools

SRC_URI[md5sum] = "135f8cb55e99a4a7b34996f260a9de6a"
SRC_URI[sha256sum] = "fb2f4239679f4de4a3213e66a2bd4ec560753d518db727ffa35bc74f3a581e83"

FILES_${PN} += "${datadir}"
