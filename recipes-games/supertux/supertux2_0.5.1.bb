DESCRIPTION = "SuperTux is a classic 2D jump'n run sidescroller game in a style similar to the original Super Mario games covered under the GPL"
HOMEAPAGE = "http://supertux.lethargik.org"
SECTION = "x11/application"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504"
DEPENDS = "boost libsdl2 libsdl2-image libvorbis curl openal-soft physfs glew"

# somehow boost is not dragged in
RDEPENDS_${PN} += "boost"

inherit cmake

# With Ninja it fails with:
# ninja: error: 'squirrel/lib/libsquirrel_static.a', needed by 'supertux2', missing and no known rule to make it
OECMAKE_GENERATOR = "Unix Makefiles"

SRC_URI = " \
    https://github.com/SuperTux/supertux/releases/download/v${PV}/SuperTux-v${PV}-Source.tar.gz \
    file://0001-CMakeLists.txt-Pin-PHYSFS_getPrefDir-autodetection-d.patch \
    file://0002-CMakeLists.txt-force-ussage-of-supertux-s-version-of.patch \
    file://0003-pass-compile-flags-to-external-projects.patch \
    file://0004-do-not-set-included-paths-as-system-causes-trouble-w.patch \
"
SRC_URI[md5sum] = "b8b678362e3c5c9e366fb1fb3550a2e0"
SRC_URI[sha256sum] = "c9dc3b42991ce5c5d0d0cb94e44c4ec2373ad09029940f0e92331e7e9ada0ac5"

S = "${WORKDIR}/SuperTux-v${PV}-Source"

EXTRA_OECMAKE = "-DINSTALL_SUBDIR_BIN=bin -DCMAKE_BUILD_TYPE=RELEASE"

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/games/supertux2 \
"
