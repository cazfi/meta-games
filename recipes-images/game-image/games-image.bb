
DESCRIPTION = "meta-games layer test image"

IMAGE_LINGUAS = " "

LICENSE = "GPL-2.0-only"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_FEATURES += "package-management x11-base x11-sato ssh-server-dropbear"

IMAGE_FSTYPES += "wic.vmdk"

FREECIV = "\
 freeciv-server \
 freeciv-gtk3.22 \
 freeciv-sdl2 \
 freeciv-qt \
"

# Left out:
# - gnome games - build failures
# - supertux2   - does not build

GAMELIST = "\
 packagegroup-core-x11-sato-games \
 ${FREECIV} \
 etr \
 pingus \
 wesnoth \
 supertuxkart \
 astromenace \
 chromium-bsu \
 maelstrom \
 atanks \
"

IMAGE_INSTALL += " \
packagegroup-core-boot \
${CORE_IMAGE_EXTRA_INSTALL} \
${GAMELIST} \
"

