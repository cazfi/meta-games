SUMMARY = "Lua binding generator for C/C++"
DESCRIPTION = "Tolua is a tool that greatly simplifies the integration of \
C/C++ code with Lua. Based on a cleaned header file, tolua automatically \
generates the binding code to access C/C++ features from Lua. Using Lua API \
and tag method facilities, tolua maps C/C++ constants, external variables, \
functions, classes, and methods to Lua."
HOMEPAGE = "http://webserver2.tecgraf.puc-rio.br/~celes/tolua/"
SECTION = "console/utils"

DEPENDS= "lua-native"
BBCLASSEXTEND = "native"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://include/tolua.h;beginline=9;endline=12;md5=4a3fbc0759a4b8318d99f3d71a773105"

# 0?- patches are from freeciv source tree. https://www.freeciv.org/
SRC_URI = "\
 http://webserver2.tecgraf.puc-rio.br/~celes/tolua/tolua-${PV}.tar.gz \
 file://MakefileFix.patch \
 file://AllLuaPath.patch \
 file://01-tolua_tolua_open-proto-before-need.patch \
 file://02-fix-use-after-free.patch \
 file://03-tolua_bnd_takeownership-prototype.patch \
 file://04-include-tolua_event.patch \
 file://05-gen-code-fix-null-dereferences.patch \
"

B = "${S}"

SRC_URI[sha256sum] = "c5a6b701b3ced9a66e7a9881c9d94430f8612040827650abe1aa3c5c3fc95bf2"

EXTRA_OEMAKE = "STAGING_DIR_NATIVE=${STAGING_DIR_NATIVE}"

do_install () {
           mkdir -p ${D}${bindir}
           mkdir -p ${D}${datadir}/tolua/lua
           install -m 0755 ${B}/bin/tolua ${D}${bindir}
           install -m 0644 ${B}/src/bin/lua/all.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/compat.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/basic.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/feature.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/verbatim.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/code.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/typedef.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/container.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/package.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/module.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/namespace.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/define.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/enumerate.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/declaration.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/variable.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/array.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/function.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/operator.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/class.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/clean.lua ${D}${datadir}/tolua/lua
           install -m 0644 ${B}/src/bin/lua/doit.lua ${D}${datadir}/tolua/lua
}
