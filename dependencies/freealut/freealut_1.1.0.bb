DESCRIPTION = "OpenAL Utility Toolkit"
SECTION = "libs"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=7ec51bd663119a90c3d50704d6051fae"

PR = "r1"

DEPENDS = "openal-soft"

SRC_URI = "http://pkgs.fedoraproject.org/repo/pkgs/${BPN}/${BPN}-${PV}.tar.gz/e089b28a0267faabdb6c079ee173664a/${BPN}-${PV}.tar.gz"

SRC_URI[md5sum] = "e089b28a0267faabdb6c079ee173664a"
SRC_URI[sha256sum] = "60d1ea8779471bb851b89b49ce44eecb78e46265be1a6e9320a28b100c8df44f"

inherit autotools binconfig
