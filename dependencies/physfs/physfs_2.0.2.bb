DESCRIPTION = "PhysicsFS is a library to provide abstract access to various archives."
SECTION = "libs"

LICENSE = "zlib"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8ad5dfd37e76cb8e82b47c55a99097d5"

PR = "r0"

DEPENDS = "readline"

SRC_URI = "http://icculus.org/physfs/downloads/physfs-${PV}.tar.gz \
 file://compile_fixes.patch \
"
SRC_URI[md5sum] = "4e8927c3d30279b03e2592106eb9184a"
SRC_URI[sha256sum] = "ae296d3148228e03fd56cc9ea58af02f87dcbb1fadef125c18b709ab37f0bc09"

S = "${WORKDIR}/physfs-${PV}"

inherit cmake
